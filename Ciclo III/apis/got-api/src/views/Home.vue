<template>
  
  <div class="d-flex flex-wrap">
    <Got v-if="desserts" :desserts=desserts :headers=headers />
    <v-spacer></v-spacer>
    <div>
      <!-- {{!!member.family}}------- -->
    </div>
    <Card v-if="member" :member=member />
  </div>
</template>

<script>
  import Got from '../components/Got'
  import Card from '../components/Card'
  import axios from "axios"

  export default ({
    name: 'Home',
    data () {
      return this.getResult();
    },
    created () {
        axios
            .get("https://thronesapi.com/api/v2/Characters")
            .then((response) => {
                this.desserts = response.data
                console.log(response)
            })
    },
    components: {
      Got,
      Card,
    },
    methods: {
      getResult() {
        window.addEventListener('member',
          (respuesta) => {
            console.log(respuesta.detail)
            return this.establecerInfo(respuesta.detail);
          });
        return this.establecerInfo(null);
      },
      establecerInfo(member){
        console.log(member)
        const resultado = {
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
            member: member,
          }
        this.member = member
        return  resultado;
      }
    }
  })
</script>
