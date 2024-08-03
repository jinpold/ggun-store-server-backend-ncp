package store.ggun.admin.service;
import store.ggun.admin.domain.model.BoardModel;
import store.ggun.admin.domain.dto.BoardDTO;

public interface BoardService extends CommandService<BoardDTO>, QueryService<BoardDTO> {




    default BoardModel dtoToEntity(BoardDTO dto){

        return BoardModel.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .description(dto.getDescription())
                .build();
    }

    default BoardDTO entityToDto(BoardModel ent){

        return BoardDTO.builder()
                .id(ent.getId())
                .title(ent.getTitle())
                .description(ent.getDescription())
                .regDate(ent.getRegDate().toString())
                .modDate(ent.getModDate().toString())
                .build();
    }
}
