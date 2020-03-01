package pl.sdacademy.designpatterns.Facade;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MVAMapperImpl implements MVAMapper {


    @Override
    public MultiValueAttribute dtoToObject(final MultiValueAttrDTO dto) {
        final MultiValueAttribute mva = new MultiValueAttribute();
        mva.setId(dto.getId());
        mva.setName(dto.getName());
        mva.setValues(Arrays.asList( dto.getCsvValues().split(",")));
        return mva;
    }
    @Override
    public MultiValueAttrDTO objectToDto(final MultiValueAttribute mva) {
        final MultiValueAttrDTO dto = new MultiValueAttrDTO();
        dto.setId(mva.getId());
        dto.setName(mva.getName());
        final String values = mva.getValues().stream()
                .collect(Collectors.joining(","));
        dto.setCsvValues(values);
        return dto;
    }
}
