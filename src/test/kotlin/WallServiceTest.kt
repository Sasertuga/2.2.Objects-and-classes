import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    @Test
    fun addPost() {
        val result = WallService.add(Post(0, text = "Text1")).id
        assertNotEquals(1,result)    }

    @Test
    fun updatePostTrue() {
        WallService.add(Post(text = "Text 1"))
        WallService.add(Post(text = "Text 2"))
        val result = WallService.update(Post(2, text = "Text2 update"))
        assertTrue(result)
    }

    @Test
    fun updatePostFalse() {
        WallService.add(Post(text = "Text 1"))
        WallService.add(Post(text = "Text 2"))
        val result = WallService.update(Post(3, text = "Text2 update"))
        assertFalse(result)
    }
}