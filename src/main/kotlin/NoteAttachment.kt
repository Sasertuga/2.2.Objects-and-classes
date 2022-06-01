class NoteAttachments {
    class NoteAttachment(param : Note) : Attachments {
        override val type: String = "note"
        val note = param

        override fun toString() : String{
            return "\n  $note"
        }
    }

}