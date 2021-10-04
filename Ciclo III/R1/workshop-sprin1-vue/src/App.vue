<template>
  <v-app>
    
    <!-- <v-card class="overflow-hidden"> -->
    <v-app-bar
      absolute
      color="white"
      elevate-on-scroll
    >


      <v-toolbar-title>Ejemplo Vue</v-toolbar-title>

      <v-spacer></v-spacer>

      Inicio
      Servicios
      Noticias
      Nuestro Equipo

      <v-img
      src="assets/logomision.png"
      ></v-img>

    </v-app-bar>

  <!-- </v-card> -->

    <v-main>
      <router-view/>
    </v-main>
  </v-app>
</template>

<script>

export default {
  name: 'App',

  data: () => ({
    //
  }),

  }
</script>
