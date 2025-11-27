package br.com.senai.jseries.service;

public interface IConverteDados {
    <T> T obterDados(String json,Class<T> classe);
}
