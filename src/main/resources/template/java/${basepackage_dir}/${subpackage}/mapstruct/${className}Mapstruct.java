<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.${subpackage}.mapstuct;
import ${basepackage}.${subpackage}.entity.${className}DO;
import ${basepackage}.${subpackage}.dto.${className}DTO;
import com.udun.web.mapstruct.BaseMapstruct;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author miller
 * @date ${.now?string["yyyy/MM/dd"]}
 * @since 1.0.0
 */
@Mapper(componentModel = "spring", uses = {}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ${className}Mapstruct extends BaseMapstruct<${className}DO, ${className}DTO> {
}