package com.comparar_Imagens.testeImagens.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comparar_Imagens.testeImagens.entity.ImageData;

public interface ImageDataRepository extends JpaRepository<ImageData, Long> {

    Optional<ImageData> findByName(String fileName);

}