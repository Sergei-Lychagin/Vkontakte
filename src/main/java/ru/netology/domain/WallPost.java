package ru.netology.domain;

import java.time.Instant;
import lombok.Data;


// описывает сообщение на стене пользователя или сообщества.
@Data
public class WallPost {

    private long Id;
    private long authorId;
    private long wallId;
    private long viewsNumber;

    private Instant lastModified;

    private boolean isFriendsOnly;
    private boolean isPinned;
    private boolean isBookmarked;
    private boolean isMarkedAsAd;

    private boolean canLike;
    private boolean canShare;
    private boolean canPin;
    private boolean canEdit;

    private LikesInfo likesInfo;
    private SharesInfo sharesInfo;
    private CommentsInfo commentsInfo;
    private ContentInfo contentInfo;
    private CopyrightInfo copyrightInfo;

    private enum type {POST, COPY, REPLY, POSTPONE, SUGGEST}
}
