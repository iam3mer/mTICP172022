import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Inicio',
    component: Home
  }
  ,
  {
    path: '/ofertas',
    name: 'Ofertas',
    component: () => import('../views/Ofertas.vue')
  },
  {
    path: '/equipo',
    name: 'Equipo',
    component: () => import('../views/Equipo.vue')
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
