package store.ggun.admin.service;
import store.ggun.admin.domain.model.ArticleModel;
import store.ggun.admin.domain.dto.ArticleDTO;
import store.ggun.admin.domain.model.BoardModel;
import store.ggun.admin.domain.model.AdminModel;
import java.util.*;

public interface ArticleService extends CommandService<ArticleDTO>, QueryService<ArticleDTO> {

    List<ArticleDTO> getArticleByBoardId(Long id);

    default ArticleModel dtoToEntity(ArticleDTO dto, BoardModel boardModel, AdminModel adminModel) {
        return ArticleModel.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .content(dto.getContent())
                .writer(adminModel)
                .boardModel(boardModel)
//                .writer(userRepository.findById(dto.getBoardId()).orElse(null))
//                .board(boardRepository.findById(dto.getBoardId()).orElse(null))
                .build();
    }
    default ArticleDTO entityToDto(ArticleModel ent) {

        return ArticleDTO.builder()
                .id(ent.getId())
                .title(ent.getTitle())
                .content(ent.getContent())
                .writerId(ent.getWriter().getId())
                .boardId(ent.getBoardModel().getId())
                .regDate(String.valueOf(ent.getModDate()))
                .modDate(String.valueOf(ent.getRegDate()))
                .build();
    }
}
