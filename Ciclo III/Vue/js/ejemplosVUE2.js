let Contador = new Vue({
    el: '#contador',
    data: {
        contador: 0
    },
    mounted() {
        setInterval(() => {
            this.contador++
        }, 1000);
    }
})

let Mensaje = new Vue({
    el: '#reverso',
    data: {
        mensaje: 'Me van a revertir',
        esVisible: false
    },
    methods: {
        reverso: function () {
            this.mensaje = this.mensaje.split('').reverse().join('')
        }
    }
})

let Modelo = new Vue({
    el: '#modelo',
    data: {
        mensaje: 'Esta es la dirección de correo!',
        correo: 'jhonatan@mail.com'
    }
})

let ListaElementos = new Vue ({
    el: '#lista',
    data: {
        elemento: '',
        elementos: []
    },
    methods: {
        agregarElemento() {
            if (this.elemento != '') {
                this.elementos.push(this.elemento),
                this.elemento = ''
            }
        },
        eliminarElemento(i) {
            this.elementos.splice(i,1)
        }
    }
})