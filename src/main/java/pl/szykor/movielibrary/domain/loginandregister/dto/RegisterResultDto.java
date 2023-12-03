package pl.szykor.movielibrary.domain.loginandregister.dto;

import lombok.Builder;

@Builder
public record RegisterResultDto(String id, String username, boolean isCreated) {
}
