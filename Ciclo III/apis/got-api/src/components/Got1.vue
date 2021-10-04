<template>
 <div class="d-flex flex-wrap">
     <v-card v-if="desserts">
        <v-card-title>
        <v-text-field
            v-model="search"
            append-icon="mdi-magnify"
            label="Search"
            single-line
            hide-details
        ></v-text-field>
        </v-card-title>
        <v-data-table
        :headers="headers"
        :items="desserts"
        :search="search"
        @click:row="mostrar"
        >
            <template v-slot:[`item.image`]="{ item }">
            <div class="p-2">
              <v-img :src="item.imageUrl" :alt="item.name" max-width="100px"></v-img>
            </div>
          </template>
        </v-data-table>
    </v-card>

    <v-spacer></v-spacer>

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
 </div>
  
</template>

<script>
  import axios from "axios"

  export default {
    data () {
      return {
        search: '',
        headers: [
          {
            text: 'ID',
            align: 'start',
            filterable: false,
            value: 'id',
          },
          
          { text: 'Foto', value: 'image' },
          { text: 'Nombre', value: 'firstName' },
          { text: 'Apellido', value: 'lastName' },
          { text: 'Titulo', value: 'title' },
          { text: 'Familia', value: 'family' },
        ],
        desserts: null,
        member: null,
      }
    },
    created() {
        axios
            .get("https://thronesapi.com/api/v2/Characters")
            .then((response) => {
                this.desserts = response.data
                console.log(response)
            })
    },
    methods: {
        mostrar(row) {
            this.member = row
        }
    },
  }
</script>