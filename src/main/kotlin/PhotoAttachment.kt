class PhotoAttachments {
    class PhotoAttachment(param : Photo) : Attachments {
        override val type: String = "photo"
        val photo = param

        override fun toString() : String{
            return "\n  $photo"
        }
    }
}