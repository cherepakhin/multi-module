package ru.perm.v.multimodule.service.impl;

import ru.perm.v.multimodule.service.EchoService;

public class EchoServiceImpl implements EchoService {
    @Override
    public String message(String message) {
        return message;
    }
}
