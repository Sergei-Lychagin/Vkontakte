package ru.netology.domain;

import lombok.Data;


// описывает содержимое публикации на стене пользователя или сообщества.
@Data
public class ContentInfo {

    private String text;
    private String imageURI;
}
