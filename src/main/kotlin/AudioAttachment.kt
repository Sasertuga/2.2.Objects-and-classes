class AudioAttachments {
    class AudioAttachment(param : Audio) : Attachments {
        override val type: String = "audio"
        val audio = param

        override fun toString() : String{
            return "\n  $audio"
        }
    }
}