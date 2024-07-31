package store.ggun.user.repository;

import store.ggun.user.domain.ArticleDto;

import java.util.List;

public interface ArticleDao {
    public List<ArticleDto> findByBoardIdDao(String boardId);
}
