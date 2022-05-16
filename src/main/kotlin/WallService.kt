object WallService {
    private var posts = emptyArray<Post>()
    private var idPost: Int = 0


    fun add(post: Post): Post {
        posts += post.copy(id = idPost)
        idPost++
        println(idPost)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, item) in posts.withIndex()) {
            if (item.id == post.id) {
                posts[index] = post.copy(ownerId = item.ownerId, date = item.date)
                return true
            }
        }
        return false
    }
}