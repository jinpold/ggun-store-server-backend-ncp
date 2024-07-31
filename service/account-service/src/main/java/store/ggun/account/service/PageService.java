package store.ggun.account.service;

import org.springframework.stereotype.Component;
import store.ggun.account.domain.dto.PageDto;

@Component
public interface PageService {
    PageDto getPageDTO(int toTalPageSize, int pageNo);

}
