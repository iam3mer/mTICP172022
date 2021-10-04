<template>
  <v-card
    class="mx-auto services-info"
    max-width="344"
  >
  <v-img
    rounded-circle
    src:infoService.img
  ></v-img>
  <v-card-title>
      {{ infoService.title }}
  </v-card-title>
  <v-card-text>
      {{ infoService.text }}
  </v-card-text>
  </v-card>
</template>

<script>
export default {
    props: [
        'infoService',
    ]
}
</script>

<style>
.services-info {
            padding: 20px;
            text-align: center;
        }
</style>