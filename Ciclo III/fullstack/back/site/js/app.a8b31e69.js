(function(e){function t(t){for(var n,o,s=t[0],l=t[1],c=t[2],u=0,f=[];u<s.length;u++)o=s[u],Object.prototype.hasOwnProperty.call(i,o)&&i[o]&&f.push(i[o][0]),i[o]=0;for(n in l)Object.prototype.hasOwnProperty.call(l,n)&&(e[n]=l[n]);d&&d(t);while(f.length)f.shift()();return r.push.apply(r,c||[]),a()}function a(){for(var e,t=0;t<r.length;t++){for(var a=r[t],n=!0,s=1;s<a.length;s++){var l=a[s];0!==i[l]&&(n=!1)}n&&(r.splice(t--,1),e=o(o.s=a[0]))}return e}var n={},i={app:0},r=[];function o(t){if(n[t])return n[t].exports;var a=n[t]={i:t,l:!1,exports:{}};return e[t].call(a.exports,a,a.exports,o),a.l=!0,a.exports}o.m=e,o.c=n,o.d=function(e,t,a){o.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:a})},o.r=function(e){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},o.t=function(e,t){if(1&t&&(e=o(e)),8&t)return e;if(4&t&&"object"===typeof e&&e&&e.__esModule)return e;var a=Object.create(null);if(o.r(a),Object.defineProperty(a,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var n in e)o.d(a,n,function(t){return e[t]}.bind(null,n));return a},o.n=function(e){var t=e&&e.__esModule?function(){return e["default"]}:function(){return e};return o.d(t,"a",t),t},o.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},o.p="/";var s=window["webpackJsonp"]=window["webpackJsonp"]||[],l=s.push.bind(s);s.push=t,s=s.slice();for(var c=0;c<s.length;c++)t(s[c]);var d=l;r.push([0,"chunk-vendors"]),a()})({0:function(e,t,a){e.exports=a("56d7")},"56d7":function(e,t,a){"use strict";a.r(t);a("e260"),a("e6cf"),a("cca6"),a("a79d");var n=a("2b0e"),i=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("v-app",[a("v-navigation-drawer",{attrs:{app:""}}),a("v-app-bar",{attrs:{app:""}}),a("v-main",[a("v-container",{attrs:{fluid:""}},[a("router-view")],1)],1),a("v-footer",{attrs:{app:""}})],1)},r=[],o={name:"App",data:function(){return{}}},s=o,l=a("2877"),c=a("6544"),d=a.n(c),u=a("7496"),f=a("40dc"),v=a("a523"),p=a("553a"),m=a("f6c4"),b=a("f774"),h=Object(l["a"])(s,i,r,!1,null,null,null),x=h.exports;d()(h,{VApp:u["a"],VAppBar:f["a"],VContainer:v["a"],VFooter:p["a"],VMain:m["a"],VNavigationDrawer:b["a"]});var g=a("8c4f"),I=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("v-data-table",{staticClass:"elevation-1",attrs:{headers:e.headers,items:e.desserts,"sort-by":"isbn",loading:"","loading-text":"Cargando... Espere un momento"},scopedSlots:e._u([{key:"top",fn:function(){return[a("v-toolbar",{attrs:{flat:""}},[a("v-toolbar-title",[e._v("Libros")]),a("v-divider",{staticClass:"mx-4",attrs:{inset:"",vertical:""}}),a("v-spacer"),a("v-dialog",{attrs:{"max-width":"500px"},scopedSlots:e._u([{key:"activator",fn:function(t){var n=t.on,i=t.attrs;return[a("v-btn",e._g(e._b({staticClass:"mb-2",attrs:{color:"primary",dark:""}},"v-btn",i,!1),n),[e._v(" Nuevo Libro ")])]}}]),model:{value:e.dialog,callback:function(t){e.dialog=t},expression:"dialog"}},[a("v-card",[a("v-card-title",[a("span",{staticClass:"text-h5"},[e._v(e._s(e.formTitle))])]),a("v-card-text",[a("v-container",[a("v-row",[a("v-col",{attrs:{cols:"12",sm:"6",md:"4"}},[a("v-text-field",{attrs:{label:"ISBN"},model:{value:e.editedItem.isbn,callback:function(t){e.$set(e.editedItem,"isbn",t)},expression:"editedItem.isbn"}})],1),a("v-col",{attrs:{cols:"12",sm:"6",md:"4"}},[a("v-text-field",{attrs:{label:"Titulo"},model:{value:e.editedItem.titulo,callback:function(t){e.$set(e.editedItem,"titulo",t)},expression:"editedItem.titulo"}})],1),a("v-col",{attrs:{cols:"12",sm:"6",md:"4"}},[a("v-text-field",{attrs:{label:"Descripción"},model:{value:e.editedItem.descripcion,callback:function(t){e.$set(e.editedItem,"descripcion",t)},expression:"editedItem.descripcion"}})],1),a("v-col",{attrs:{cols:"12",sm:"6",md:"4"}},[a("v-text-field",{attrs:{label:"Genero"},model:{value:e.editedItem.genero,callback:function(t){e.$set(e.editedItem,"genero",t)},expression:"editedItem.genero"}})],1),a("v-col",{attrs:{cols:"12",sm:"6",md:"4"}},[a("v-text-field",{attrs:{label:"Autores"},model:{value:e.editedItem.autores,callback:function(t){e.$set(e.editedItem,"autores",t)},expression:"editedItem.autores"}})],1)],1)],1)],1),a("v-card-actions",[a("v-spacer"),a("v-btn",{attrs:{color:"blue darken-1",text:""},on:{click:e.close}},[e._v(" Cancelar ")]),a("v-btn",{attrs:{color:"blue darken-1",text:""},on:{click:e.save}},[e._v(" Guardar ")])],1)],1)],1),a("v-dialog",{attrs:{"max-width":"500px"},model:{value:e.dialogDelete,callback:function(t){e.dialogDelete=t},expression:"dialogDelete"}},[a("v-card",[a("v-card-title",{staticClass:"text-h5"},[e._v("Esta seguro de eliminar este libro?")]),a("v-card-actions",[a("v-spacer"),a("v-btn",{attrs:{color:"blue darken-1",text:""},on:{click:e.closeDelete}},[e._v("Cancelar")]),a("v-btn",{attrs:{color:"blue darken-1",text:""},on:{click:e.deleteItemConfirm}},[e._v("Aceptar")]),a("v-spacer")],1)],1)],1)],1)]},proxy:!0},{key:"item.actions",fn:function(t){var n=t.item;return[a("v-icon",{staticClass:"mr-2",attrs:{small:""},on:{click:function(t){return e.editItem(n)}}},[e._v(" mdi-pencil ")]),a("v-icon",{attrs:{small:""},on:{click:function(t){return e.deleteItem(n)}}},[e._v(" mdi-delete ")])]}},{key:"no-data",fn:function(){return[a("v-btn",{attrs:{color:"primary"},on:{click:e.initialize}},[e._v(" Reset ")])]},proxy:!0}])})},k=[],y=(a("a434"),a("bc3a")),_=a.n(y),w=_.a.create({timeout:3e3,headers:{"Content-Type":"application/json"}}),V=w,O="/api/books",C=function(){return V.get(O)},j=function(e){return V.delete("".concat(O,"/isbn/").concat(e))},D={data:function(){return{dialog:!1,dialogDelete:!1,headers:[{text:"ISBN",align:"start",value:"isbn"},{text:"Titulo",value:"titulo"},{text:"Descripción",value:"descripcion"},{text:"Genero",value:"genero"},{text:"Autores",value:"autores"},{text:"Opciones",value:"actions",sortable:!1}],desserts:[],editedIndex:-1,editedItem:{name:"",calories:0,fat:0,carbs:0,protein:0},defaultItem:{name:"",calories:0,fat:0,carbs:0,protein:0}}},computed:{formTitle:function(){return-1===this.editedIndex?"New Item":"Edit Item"}},watch:{dialog:function(e){e||this.close()},dialogDelete:function(e){e||this.closeDelete()}},created:function(){this.initialize()},methods:{initialize:function(){var e=this;C().then((function(t){e.desserts=t.data})).catch((function(e){return console.error(e)}))},editItem:function(e){this.editedIndex=this.desserts.indexOf(e),this.editedItem=Object.assign({},e),this.dialog=!0},deleteItem:function(e){this.editedIndex=this.desserts.indexOf(e),this.editedItem=Object.assign({},e),this.dialogDelete=!0,j(e.isbn)},deleteItemConfirm:function(){this.desserts.splice(this.editedIndex,1),this.closeDelete()},close:function(){var e=this;this.dialog=!1,this.$nextTick((function(){e.editedItem=Object.assign({},e.defaultItem),e.editedIndex=-1}))},closeDelete:function(){var e=this;this.dialogDelete=!1,this.$nextTick((function(){e.editedItem=Object.assign({},e.defaultItem),e.editedIndex=-1}))},save:function(){this.editedIndex>-1?Object.assign(this.desserts[this.editedIndex],this.editedItem):this.desserts.push(this.editedItem),this.close()}}},T=D,S=a("8336"),$=a("b0af"),A=a("99d9"),P=a("62ad"),E=a("8fea"),M=a("169a"),N=a("ce7e"),B=a("132d"),z=a("0fd9"),G=a("2fa4"),F=a("8654"),J=a("71d9"),L=a("2a7f"),R=Object(l["a"])(T,I,k,!1,null,null,null),H=R.exports;d()(R,{VBtn:S["a"],VCard:$["a"],VCardActions:A["a"],VCardText:A["b"],VCardTitle:A["c"],VCol:P["a"],VContainer:v["a"],VDataTable:E["a"],VDialog:M["a"],VDivider:N["a"],VIcon:B["a"],VRow:z["a"],VSpacer:G["a"],VTextField:F["a"],VToolbar:J["a"],VToolbarTitle:L["a"]}),n["a"].use(g["a"]);var q=[{path:"/",name:"Home",component:H}],K=new g["a"]({mode:"history",base:"/",routes:q}),Q=K,U=a("f309");n["a"].use(U["a"]);var W=new U["a"]({});n["a"].config.productionTip=!1,new n["a"]({router:Q,vuetify:W,render:function(e){return e(x)}}).$mount("#app")}});
//# sourceMappingURL=app.a8b31e69.js.map