<template>
    
    <div>
        <div v-if="result">
            <p>User ID: {{ result.userId }}</p>
            <p>ID: {{ result.id }}</p>
            <p>Title: {{ result.title }}</p>
            <p>Body: {{ result.body }}</p>

            {{ result }}
        </div>

        -------------------------------------

        <div v-if="resultComments">
            <p>Post ID: {{ resultComments.data.postId }}</p>
            <p>ID: {{ resultComments.data.id }}</p>
            <p>Name: {{ resultComments.data.name }}</p>
            <p>E-Mail: {{ resultComments.data.email }}</p>
            <p>Body {{ resultComments.data.body }}</p>

            {{resultComments}}
        </div>

    </div>
    
</template>

<script>
import axios from "axios"

export default {
    data: () => ({
        result: null,
        resultComments: null
    }),
    created() {
        // GET
        axios
            .get("https://jsonplaceholder.typicode.com/posts/100")
            .then((result) => {
                console.log(result)
                this.result = result.data
            })
            // Gestion de errores
            .catch(error => {
                console.log(error)
            })
        // DELETE
        // axios.delete("https://jsonplaceholder.typicode.com/posts/1").then((result) => {
        //     console.log(result)
        // })
        // POST
        // let post = {
        //     userId: 1,
        //     title: 'New Post',
        //     body: 'kjfdhsdgfhs fsidhf sdfh osidhjfskhgfskjdf shpdñfhskdfghi'
        // }
        // axios.post("https://jsonplaceholder.typicode.com/posts", post).then((result) => {
        //     console.log(result)
        // })
        // PUT
        // let post = {
        //     userId: 101,
        //     title: 'New Post',
        //     body: 'kjfdhsdgfhs fsidhf sdfh osidhjfskhgfskjdf shpdñfhskdfghi'
        // }
        // axios.put("https://jsonplaceholder.typicode.com/posts/1", post).then((result) => {
        //     console.log(result)
        // })

        // Llamado a los metodos (methods)
        this.getCommentsId();
        // this.setPostId();
    },
    // async created() {
    //     this.resultComments = await axios.get("https://jsonplaceholder.typicode.com/comments/1")
    // },
    methods: {
        async getCommentsId() {
            // Incluye gestion de errores
            try {
                let response = await axios.get("https://jsonplaceholder.typicode.com/comments/1")
                console.log(response)
                this.resultComments = response
            } catch (error) {
                console.log(error)
            }
        },
        async setPostId() {
            let post = {
                userId: 1,
                title: 'New Post',
                body: 'kjfdhsdgfhs fsidhf sdfh osidhjfskhgfskjdf shpdñfhskdfghi'
            }
            let response = await axios.put("https://jsonplaceholder.typicode.com/posts/1", post)
            console.log(response)
        }
    }
}
</script>