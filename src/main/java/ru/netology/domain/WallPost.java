package ru.netology.domain;


import lombok.Data;


// описывает сообщение на стене пользователя или сообщества.
@Data
public class WallPost {

    private long Id;
    private long authorId;
    private long wallId;
    private long viewsNumber;
    private boolean isFriendsOnly;
    private boolean isPinned;

    private LikesInfo likesInfo;
    private SharesInfo sharesInfo;
    private CommentsInfo commentsInfo;
    private ContentInfo contentInfo;
}
