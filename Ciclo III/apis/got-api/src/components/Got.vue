<template>
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

</template>

<script>
  export default {
    data () {
      return {
        search: '',
        member: null,
      }
    },
    props: [
      'desserts',
      'headers'
    ],
    methods: {
        mostrar(row) {
            this.member = row
            console.log(this.member)
            window.dispatchEvent(new CustomEvent('member', {
              detail: this.member
            }));
        },
        // async getmember(obj) {
        //   let member = await 
        // }
    },
    computed: {
      iniciar: () => {
        window.dispatchEvent(new CustomEvent('member', {
              detail: null
            }))
      },
    }
  }
</script>