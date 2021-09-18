<template>
  <v-card
    class="mx-auto"
    max-width="344"
  >
    <v-img
      :src=infoCard.img
      height="200px"
    ></v-img>

    <v-card-title>
        {{ infoCard.titleCard }}
    </v-card-title>

    <v-card-subtitle>
      {{ infoCard.subtitleCard }}
    </v-card-subtitle>

    <v-card-actions>
      <v-btn
        color="orange lighten-2"
        text
      >
        Ir al sitio
      </v-btn>

      <v-spacer></v-spacer>

      <v-btn
        icon
        @click="show = !show"
      >
        <v-icon>{{ show ? 'mdi-chevron-up' : 'mdi-chevron-down' }}</v-icon>
      </v-btn>
    </v-card-actions>

    <v-expand-transition>
      <div v-show="show">
        <v-divider></v-divider>

        <v-card-text>
          {{ infoCard.textCard }}
        </v-card-text>
      </div>
    </v-expand-transition>
  </v-card> 
</template>

<script>
  export default {
    name: 'MyCard',
    data: () => ({
      show: false
    }),
    props: [
        'infoCard',
    ]
  }
</script>