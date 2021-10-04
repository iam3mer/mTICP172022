<template>
  <v-card
    class="mx-auto member-info"
    max-width="344"
  >
  <v-img
    rounded-circle
    src=infoMember.img
  ></v-img>
  <v-card-title>
      {{ infoMember.title }}
  </v-card-title>
  <v-card-text>
      {{ infoMember.text }}
  </v-card-text>
  </v-card>
</template>

<script>
export default {

}
</script>

<style>
.member-info {
            padding: 20px;
            text-align: left;
        }
</style>