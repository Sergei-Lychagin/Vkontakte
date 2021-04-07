package ru.netology.domain;

import lombok.Data;

// описывает репосты сообщения на стене пользователя или сообщества.
@Data
public class SharesInfo {

    private long counter;
    private boolean userShared;
}
