<template>
    <v-container>
        <v-card
  >

  <v-card-title>Registrar y Eliminar Direcciones de Correo</v-card-title>

  <v-form
    ref="form"
    v-model="valid"
    v-on:submit.prevent="stop"
    lazy-validation
  >

    <v-text-field
      v-model="correo"
      :rules="correoRules"
      label="Correo"
      @keyup.enter="agregarDirCorreo"
      required
    ></v-text-field>

    <v-btn
      :disabled="!valid"
      color="success"
      class="mr-4"
      @click="agregarDirCorreo"
    >
      Agregar
    </v-btn>

  </v-form>

  <v-list>
      <v-list-item-group v-model="model">
        <v-list-item
          v-for="(item, i) in correos"
          :key="i"
        >
          <v-list-item-content>
            <v-list-item-title @click="eliminarDirCorreo(i)" v-text="item"></v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list-item-group>
    </v-list>
    
  </v-card>
    </v-container>
    
</template>

<script>
export default {
    name: 'ListaCorreo',
    data: () => ({
        model: 2,
        correos: [],

        // FORM
        valid: true,
        correo: '',
        correoRules: [
          v => !!v || 'Debe ingresar una dirección de correo',
          v => /.+@.+\..+/.test(v) || 'No ha ingresado una dirección de correo valida!',
        ],

    }),
    methods: {
        agregarDirCorreo() {
          this.$refs.form.validate()
          if (this.correo != '') {
            this.correos.push(this.correo)
            this.correo = ''
          }
        },
        eliminarDirCorreo(indice) {
            this.correos.splice(indice, 1)
        },
    }
}
</script>
