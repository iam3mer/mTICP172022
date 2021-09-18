<template>
  <v-app>

    <!-- Menu Lateral -->
    <v-navigation-drawer
      app
      v-model="drawer"
    >
      <template v-slot:prepend>
        <v-list-item two-line>
          <v-list-item-avatar>
            <img src="https://pbs.twimg.com/profile_images/1362864815023280135/ecbds5N-_400x400.jpg">
          </v-list-item-avatar>

          <v-list-item-content>
            <v-list-item-title>Jhonatan Barrera</v-list-item-title>
            <v-list-item-subtitle>Conectado</v-list-item-subtitle>
          </v-list-item-content>
        </v-list-item>
      </template>

      <v-divider></v-divider>

      <v-list dense>
        <v-list-item
          v-for="item in items"
          :key="item.title"
        >
          <v-list-item-icon>
            <v-icon>{{ item.icon }}</v-icon>
          </v-list-item-icon>

          <v-list-item-content>
            <v-list-item-title>
              <router-link
                :to="{ name: item.url }"
                style="text-decoration: none; color: inherit;"
              >
                {{ item.title }}
                </router-link>
            </v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list>
    </v-navigation-drawer>

    <!-- Menu Aplicación -->
    <v-app-bar
        app
        color="light-blue darken-3"
        dense
        dark
      >
        <!-- Icono Menu Lateral -->
        <v-app-bar-nav-icon @click="drawer = !drawer"></v-app-bar-nav-icon>

        <v-toolbar-title>Aplicación de Prueba</v-toolbar-title>

        <v-spacer></v-spacer>

        <v-btn icon>
          <v-icon>mdi-heart</v-icon>
        </v-btn>

        <!-- Opciones Lateral derecho Menu Aplicación -->
        <v-menu
          left
          bottom
        >
          <template v-slot:activator="{ on, attrs }">
            <v-btn
              icon
              v-bind="attrs"
              v-on="on"
            >
              <v-icon>mdi-dots-vertical</v-icon>
            </v-btn>
          </template>

          <v-list>
            <v-list-item
              v-for="n in 5"
              :key="n"
              @click="() => {}"
            >
              <v-list-item-title>Option {{ n }}</v-list-item-title>
            </v-list-item>
          </v-list>
        </v-menu>
        
    </v-app-bar>>

    <!-- Sizes your content based upon application components -->
    <v-main>

      <!-- Provides the application the proper gutter -->
      <v-container fluid>

        <!-- If using vue-router -->
        <router-view></router-view>
      </v-container>
    </v-main>

    <!-- <v-footer
      dark
      padless
      app
    >
    <v-card
      class="flex"
      flat
      tile
    >
      <v-card-title
        background-color="light-blue darken-3"
        class="teal" 
      >
        <strong class="subheading">Siguenos en nuestras redes sociales!</strong>

        <v-spacer></v-spacer>

        <v-btn
          v-for="icon in icons"
          :key="icon"
          class="mx-4"
          dark
          icon
        >
          <v-icon size="24px">
            {{ icon }}
          </v-icon>
        </v-btn>
      </v-card-title>

      <v-card-text class="py-2 white--text text-center">
        {{ new Date().getFullYear() }} — <strong>Vuetify</strong>
      </v-card-text>
    </v-card>
    </v-footer> -->

  </v-app>
</template>

<script>
export default {
  name: 'App',

  data: () => ({
    drawer: true,
    items: [
          { title: 'Inicio', url: 'Home', icon: 'mdi-home-city' },
          { title: 'appCorreo', url: 'Correo', icon: 'mdi-format-list-bulleted' },
          { title: 'appInfoTarjeta', url: 'InfoCard', icon: 'mdi-card-bulleted-outline' },
        ],
  }),
};
</script>
