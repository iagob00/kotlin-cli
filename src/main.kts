#!/usr/bin/env kotlin
// Inferencia de Tipo
// tipo não declarado
val username = "user 1"
var password = "password"
val id = 54
var status = 0
var permissions = listOf("READ", "WRITE", "DELETE")

// fortemente tipado
var versaoCodigo: Double = 1.45



// Tratamento de NPE
//Tipos Nullaveis
var telefone : String? = "75981104712"

//telefone = null

var ddd = telefone?.substring(0, 2) ?: 79 // ddd por default vai ser a do estado atual
var statusVerbose = if (status == 1) "ativo" else "inativo"
println("o telefone do usuário $username possui ddd $ddd \n O mesmo está $statusVerbose para contato")
