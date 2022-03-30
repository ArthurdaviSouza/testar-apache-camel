package arthur.test.controller.controller.origem;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/objetos")
@Api(value = "objetos")
public class OrigemController {

    @ApiOperation(value = "Busca informacoes de origem")
    @GetMapping("/test/material/{material}/nome/{nome}")
    public ResponseEntity<?> getAsnRetailInfoFromSAP(
            @PathVariable String material,
            @PathVariable String nome) {
            String response = "Integracao ocorreu com sucesso na origem ";
        return ResponseEntity.ok().body(response);
    }
}
