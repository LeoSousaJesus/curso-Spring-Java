package br.com.senai.jseries.service;

// Interfaces Genéricas
public interface IConverteDados {
    <T> T obterDados(String json,Class<T> classe);
}
