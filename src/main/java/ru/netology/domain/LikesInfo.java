package ru.netology.domain;

import lombok.Data;

//описывает лайки к сообщению на стене пользователя или сообщества.
@Data
public class LikesInfo {

    private long counter;
    private boolean userLiked;
    private boolean canLike;
    private boolean canShare;
}
