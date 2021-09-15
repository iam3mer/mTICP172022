data = {
    xyz: '<p style="color:blue">Hola Mundo</p>',
    anio: 2021,
    resta: 8-3,
    valor: 'soyUnID',
    seen: true,
    message: 'Ahora me vez!',
    url: 'https://www.google.com',
    target: '_blank'
}

// Object.freeze(data)

let app = new Vue({
    el: '#HM',
    data: data,
    computed: {
        reverso: function () {
            return this.message.split('').reverse().join('')
        }
    },
    methods: {
        reverso: function () {
            this.mensaje = this.message.split('').reverse().join('')
        }
    }
})

