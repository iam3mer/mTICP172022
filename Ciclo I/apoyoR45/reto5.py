import json
import pandas as pd
import numpy as np

def preProcesado (DF):
    # Funcion que prepara los generos en un DF para ser codificadas en la matriz
    # Devuelve tambien los generos en una lista
    categoriasDF = DF['categories'].apply(pd.Series)
    categoriasDF ['business_id'] = DF['business_id']
    categoriasDF = categoriasDF . drop_duplicates ([ 'business_id'])
    categoriasDF . set_index ('business_id', inplace = True )
    categories = [ categoriasDF [ categorie ]. unique () for categorie in categoriasDF .
    columns ]
    categories = [ categorie for lista in categories for categorie in lista if all
    ([ pd. isnull ( categorie ) == False , categorie != ' ', categorie != '', len (
    str ( categorie )) > 1]) ]
    categories = list ( set ( categories ))
    return categoriasDF , categories

def codificaMatriz (DF , categories : list , producto : list ):
    # Funcion que inserta unos en la matriz
    # Su codigo aqui
    mcategories = pd.DataFrame(
        np.zeros((len(categories), len(producto))),
        index=categories,
        columns=list(producto)
    )
    
    for business in DF.index:
        for index in DF:
            categorie = DF[index][business]
            if categorie in categories:
                mcategories[business][categorie] = 1

    return mcategories# Debe retornar un DF como el de la Tabla 1.

def recomiendaNegocio ( url_puntuacion :str , url_perfil :str , url_recomendacion : str)->json :
    
    dataPerfil = pd.read_json(url_perfil)
    dataPerfil, categoriesPuntuacion = preProcesado(dataPerfil)
    businessPuntuacion = dataPerfil.index
    
    mcategories = codificaMatriz(dataPerfil, categoriesPuntuacion, businessPuntuacion)

    puntuacionesNegocio = pd.read_csv(url_puntuacion, sep=';',names=['business_id', 'peso'],index_col=['business_id'])
    
    for business in mcategories.columns:
        if business in puntuacionesNegocio.index:
            mcategories[business] = mcategories[business].apply(lambda point: float(point * puntuacionesNegocio['peso'][business]))

    mcategories['ponderacionPerfilUsuario'] = [mcategories.loc[categorie,:].sum() for categorie in mcategories.index]
    mcategories['ponderacionPerfilUsuario'] = mcategories['ponderacionPerfilUsuario'].apply(lambda point: point / mcategories['ponderacionPerfilUsuario'].sum())
    print(mcategories)
    
    

    return json.dumps(solucion)

print(recomiendaNegocio('https://git.io/JZKue', 'https://git.io/JZK0H', 'https://git.io/JZKE4'))