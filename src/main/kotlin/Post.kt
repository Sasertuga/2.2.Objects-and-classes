data class Post(
    val id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int = 0,
    val date: Int = 0,
    val text: String = "",
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean = false,
    val comments: Comments = Comments(),
    val copyright: Copyright = Copyright(),
    val likes: Likes? = Likes(),
    val reposts: Reposts? = Reposts(),
    val views: Views? = Views(),
    val postType: String = "",
    val signerId: Int = 0,
    val canPin: Boolean = false,
    val canDelete: Boolean = false,
    val canEdit: Boolean = false,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val donut: Donut? = Donut(),
    val postponedId: Int = 0,
    val attachments: Array<Attachments>? = emptyArray(),
)

data class Comments(
    val count: Int = 0,
    val canPost: Boolean = false,
    val groupsCanPost: Boolean = false,
    val canClose: Boolean = false,
    val canOpen: Boolean = false
)

data class Copyright(
    val id: Int = 0,
    val link: String = "",
    val name: String = "",
    val type: String = ""
)

data class Likes(
    val count: Int = 0, // число юзеров
    val userLikes: Boolean = false,
    val canLike: Boolean = false,
    val canPublish: Boolean = false
)

data class Reposts(
    val count: Int = 0,
    val userReposted: Boolean = false // наличие репоста от текущего юзера
)

data class Views(
    val count: Int = 0 // число просмотров записи
)

data class Donut(
    val isDonut: Boolean = false, // запись доступна только донам
    val paidDuration: Int = 0, // время доступа записи донов
    val placeholder: String = "", // заглушка не донам
    val canPublishFreeCopy: Boolean = false, // открыть запись для всех
    val editMode: String = "" //
)

data class Audio(
    val id: Int, // Идентификатор аудиозаписи.
    val owner_id: Int, // Идентификатор владельца аудиозаписи.
    val artist: String, // Исполнитель
    val title: String, // Название композиции
    val duration: Int, // Длительность аудиозаписи в секундах
    val url: String, // Ссылка на mp3.
    val lyrics_id: Int, // Идентификатор текста аудиозаписи (если доступно).
    val album_id: Int, // Идентификатор альбома, в котором находится аудиозапись (если присвоен).
    val genre_id: Int, // Идентификатор жанра из списка аудио жанров.
    val date: Int, // Дата добавления.
    val no_search: Int, // 1, если включена опция «Не выводить при поиске». Если опция отключена, поле не возвращается.
    val is_hq: Int, // 1, если аудио в высоком качестве.
)

data class Gift(
    val id: Int, // Идентификатор подарка.
    val thumb_256: String, // URL изображения 256x256px.
    val thumb_96: String, // URL изображения 96x96px.
    val thumb_48: String // URL изображения 48x48px.
)

data class Note(
    val id: Int, // Идентификатор заметки.
    val owner_id: Int, // Идентификатор владельца заметки.
    val title: String, // Заголовок заметки.
    val text: String, // Текст заметки.
    val date: Int, // Дата создания заметки в формате Unixtime.
    val comments: Int, // Количество комментариев.
    val readComments: Int, // Количество прочитанных комментариев (только при запросе информации о заметке текущего пользователя).
    val viewUrl: String, // URL страницы для отображения заметки.
    val privacyView: String, // Настройки приватности просмотра заметки
    val privacyComment: String, // Настройки приватности комментирования заметки
    val canComment: Boolean, // Есть ли возможность оставлять комментарии
    val textWiki: String // Тэги ссылок на wiki
)

data class Photo(
    val id: Int, // Идентификатор фотографии.
    val albumId: Int, // Идентификатор альбома, в котором находится фотография.
    val ownerId: Int, // Идентификатор владельца фотографии.
    val userId: Int, // Идентификатор пользователя, загрузившего фото (если фотография размещена в сообществе). Для фотографий, размещенных от имени сообщества, user_id = 100.
    val text: String, // Текст описания фотографии.
    val date: Int, // Дата добавления в формате Unix time.
    val width: Int, // Ширина оригинала фотографии в пикселах.
    val height: Int // Высота оригинала фотографии в пикселах.
)

data class Video(
    val id: Int, //	Идентификатор видеозаписи
    val owneId: Int, // Идентификатор владельца видеозаписи
    val title: String, // Название видеозаписи
    val description: String, // Текст описания видеозаписи
    val duration: Int, // Длительность ролика в секундах
    val date: Int, // Дата создания видеозаписи в формате Unix time
    val adding_date: Int, // Дата добавления видеозаписи пользователем или группой в формате Unix time.
    val views: Int, //	Количество просмотров видеозаписи
    val localViews: Int, // Если видео внешнее, количество просмотров в ВК
    val comments: Int, // Количество комментариев к видеозаписи
    val player: String, // URL страницы с плеером, который можно использовать для воспроизведения ролика в браузере. Поддерживается flash и html5, плеер всегда масштабируется по размеру окна.
    val platform: String, // Название платформы (для видеозаписей, добавленных с внешних сайтов)
    val canAdd: Boolean, // Может ли пользователь добавить видеозапись к себе, true может
    val isPrivate: Boolean = true, // Поле возвращается, если видеозапись приватная (например, была загружена в личное сообщение), всегда содержит 1.
    val accessKey: String, // Ключ доступа к объекту. Подробнее см. Ключ доступа к данным access_key.
    val processing: Boolean, // Поле возвращается в том случае, если видеоролик находится в процессе обработки, всегда содержит 1.
    val isFavorite: Boolean, // true, если объект добавлен в закладки у текущего пользователя.
    val canComment: Boolean, // Может ли пользователь комментировать видео. True может
    val canEdit: Boolean, // Может ли пользователь редактировать видео, true может
    val canLike: Boolean, // Может ли пользователь добавить видео в список <<Мне нравится>>, true может
    val canRepost: Boolean, // Может ли пользователь сделать репост видео, true может
    val canSubscribe: Boolean, // Может ли пользователь подписаться на автора видео, true может
    val canAddToFaves: Boolean, // Может ли пользователь добавить видео в избранное. True может
    val canAttachLink: Boolean, // Может ли пользователь прикрепить кнопку действия к видео.  True может
    val width: Int, // Ширина видео
    val height: Int, // Высота видео
    val userId: Int, // Идентификатор пользователя, загрузившего видео, если оно было загружено в группу одним из участников
    val converting: Boolean, // Конвертируется ли видео, true - да
    val added: Boolean, // Добавлено ли видео в альбомы пользователя, true - да
    val isSubscribed: Boolean, // Подписан ли пользователь на автора видео.true - да
    val repeat: Int, // Поле возвращается в том случае, если видео зациклено, всегда содержит 1
    val type: String, // Тип видеозаписи. Может принимать значения: "video", "music_video", "movie".
    val balance: Int, // Баланс донатов в прямой трансляции.
    val live_status: String, // Статус прямой трансляции. Может принимать значения: "waiting", "started", "finished", "failed", "upcoming".
    val live: Boolean, // Поле возвращается в том случае, если видеозапись является прямой трансляцией, всегда содержит 1. Обратите внимание, в этом случае в поле duration содержится значение 0.
    val upcoming: Boolean, // Поле свидетельствует о том, что трансляция скоро начнётся
    val spectators: Int, // Количество зрителей прямой трансляции
)