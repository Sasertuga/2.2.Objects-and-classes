class GiftAttachments {
    class GiftAttachment(param : Gift) : Attachments {
        override val type: String = "gift"
        val gift = param

        override fun toString() : String{
            return "\n  $gift"
        }
    }
}