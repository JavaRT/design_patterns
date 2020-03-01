package pl.sdacademy.designpatterns.Facade;

import java.util.List;
import java.util.stream.Collectors;

public class MultiValueAttrService {
    private final MVAMapper mapper;
    private final MultiValueAttrRepo repo;

    public MultiValueAttrService(MVAMapper mapper, MultiValueAttrRepo repo) {
        this.mapper = mapper;
        this.repo = repo;
    }
    public MultiValueAttrDTO getById (final Long id){
       final MultiValueAttribute mva = repo.getById(id);
       return mapper.objectToDto(mva);
    }
    public List<MultiValueAttrDTO> getAll (){
        return repo.findAll().stream()
                .map(mva -> mapper.objectToDto(mva))
                .collect(Collectors.toList());
    }
    public MultiValueAttrDTO create (final MultiValueAttrDTO dto) {
        final MultiValueAttribute mva = mapper.dtoToObject(dto);
        final MultiValueAttribute createdMva = repo.create(mva);
        return mapper.objectToDto(createdMva);

    }
}
