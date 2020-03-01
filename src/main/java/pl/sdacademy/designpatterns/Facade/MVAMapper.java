package pl.sdacademy.designpatterns.Facade;

public interface MVAMapper {
    MultiValueAttribute dtoToObject(MultiValueAttrDTO dto);
    MultiValueAttrDTO objectToDto(MultiValueAttribute mva);

}
