<template>
     
    <v-card v-if="member">
      <v-card-title>{{member.title}}</v-card-title>
      <v-img
      max-width=300px
      :src=member.imageUrl>
      </v-img>
      <v-card-text>
          <p>First Name: {{member.firstName}}</p>
          <p>Last Name: {{member.lastName}}</p>
          <p>Title: {{member.title}}</p>
          <p>Family: {{member.family}}</p>
          <p>Image: {{member.image}}</p>
      </v-card-text>
    </v-card>
  
</template>

<script>
export default {
    props: [
        'member'
    ],
}
</script>