class VideoAttachments {
    class VideoAttachment(param : Video) : Attachments {
        override val type: String = "video"
        val video = param

        override fun toString() : String{
            return "\n  $video"
        }

    }
}