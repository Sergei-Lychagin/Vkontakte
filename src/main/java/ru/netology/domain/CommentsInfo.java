package ru.netology.domain;

import lombok.Data;

// Описывает комментарии к сообщению на стене пользователя или сообщества.
@Data
public class CommentsInfo {

    private long counter;

    private boolean canPost;
    private boolean canOpen;
    private boolean canClose;
}
