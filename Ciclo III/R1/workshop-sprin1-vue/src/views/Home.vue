<template>
  <div>
    <Carousel/>

    <div class="d-flex flex-wrap">
      <Service :infoService="infoService"/>
    </div>

    <Article :infoArticle="infoArticle"/>
  </div>
</template>

<script>
import Article from '../components/Article.vue'
import Carousel from '../components/Carousel.vue'
import Service from '@/components/Service.vue'

  export default {
    name: 'Home',

    data: () => ({
      infoArticle: {
        title: 'Titulo de la nota',
        text: 'sdfgsfgdfgdfgdfgdfg',
        img: 'https://cdn.vuetifyjs.com/images/carousel/squirrel.jpg'
      },
      infoService: {
        title: 'Titulo del servicio',
        text: 'sdfgsfgdfgdfgdfgdfg',
        img: 'https://cdn.vuetifyjs.com/images/carousel/squirrel.jpg'
      }
    }),

    components: {
      Carousel,
      Article,
      Service,
    },
  }
</script>
