<template>
  <v-app id="inspire">
        <div
        class="d-flex flex-wrap justify-space-around mb-6"
        :color="$vuetify.theme.dark ? 'grey darken-3' : 'grey lighten-4'"
        flat
        tile
        >
            <div class="pa-2" v-for="item, i in arrayCard" :key="i">
                    <MyCard :infoCard=arrayCard[i] />
            </div>
        </div>
  </v-app>
</template>

<script>
  import MyCard from '@/components/MyCard'

  export default {
    name: 'InfoCard',

    components: {
      MyCard,
    },

    data: () => ({
        arrayCard: [
        {
            titleCard: "Tarjeta 1",
            subtitleCard: "agsdfgsdg",
            textCard: "fgskdhfskjdfsjhfgbsjflhbskd",
            img: `https://picsum.photos/500/300?image=10`
        },
        {
            titleCard: "Tarjeta 2",
            subtitleCard: "agsdfgsdg",
            textCard: "fgskdhfskjdfsjhfgbsjflhbskd",
            img: `https://picsum.photos/500/300?image=20`
        },
        {
            titleCard: "Tarjeta 3",
            subtitleCard: "agsdfgsdg",
            textCard: "fgskdhfskjdfsjhfgbsjflhbskd",
            img: `https://picsum.photos/500/300?image=30`
        },
        {
            titleCard: "Tarjeta 4",
            subtitleCard: "agsdfgsdg",
            textCard: "fgskdhfskjdfsjhfgbsjflhbskd",
            img: `https://picsum.photos/500/300?image=40`
        },
        {
            titleCard: "Tarjeta 5",
            subtitleCard: "agsdfgsdg",
            textCard: "fgskdhfskjdfsjhfgbsjflhbskd",
            img: `https://picsum.photos/500/300?image=50`
        }
    ]
    })
  }
</script>