package arthur.test.controller.controller.destino;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/destino")
@Api(value = "objetos")
public class DestinoController {

    @ApiOperation(value = "Busca informacoes")
    @GetMapping("/test/material/{material}/nome/{nome}")
    public ResponseEntity<?> getAsnRetailInfoFromSAP(
            @PathVariable String material,
            @PathVariable String nome) {
            String response = "Integracao ocorreu com sucesso no destino final";
        return ResponseEntity.ok().body(response);
    }
}
