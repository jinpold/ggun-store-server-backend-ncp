package store.ggun.user.service;

import store.ggun.user.domain.ArticleDto;
import store.ggun.user.domain.ArticleModel;

import java.util.List;

public interface ArticleService {
    ArticleModel save(ArticleDto model, String id);

    List<ArticleDto> findAllByBoardId(String boardId);
}
