<template>
  <v-card
    class="mx-auto"
    max-width="344"
    outlined
  >
    <v-list-item three-line>
        <v-list-item-avatar
        tile
        size="80"
        color="grey"
      ></v-list-item-avatar>

      <v-list-item-content>
        <v-list-item-title class="text-h5 mb-1">
          {{ infoArticle.title }}
        </v-list-item-title>
      </v-list-item-content>
    </v-list-item>

    <v-card-tex>
        {{ infoArticle.text }}
    </v-card-tex>
  </v-card>
</template>

<script>
export default {
    props: [
        'infoArticle'
    ]
}
</script>

<style>

</style>