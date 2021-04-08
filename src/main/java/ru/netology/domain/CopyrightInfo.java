package ru.netology.domain;

import lombok.Data;

//описывает информацию об авторских правах на сообщение на стене пользователя или сообщества.
@Data
public class CopyrightInfo {

    private int id;
    private String link;
    private String name;
    private String type;
}
