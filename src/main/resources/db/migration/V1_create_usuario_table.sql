DECLARE
    v_count NUMBER;
BEGIN
    -- Verifica se a tabela já existe
    SELECT COUNT(*) INTO v_count
    FROM all_tables
    WHERE table_name = 'USUARIOS' AND owner = 'SEU_USUARIO';

    IF v_count = 0 THEN
        EXECUTE IMMEDIATE '
            CREATE TABLE usuarios (
                id NUMBER PRIMARY KEY,
                nome VARCHAR2(100) NOT NULL,
                email VARCHAR2(100) NOT NULL UNIQUE,
                senha VARCHAR2(100) NOT NULL,
                papel VARCHAR2(50) NOT NULL
            )
        ';
    END IF;
END;
/

-- Criação da sequence (só se não existir)
DECLARE
    v_count NUMBER;
BEGIN
    SELECT COUNT(*) INTO v_count
    FROM all_sequences
    WHERE sequence_name = 'SEQ_USUARIOS_ID' AND sequence_owner = 'SEU_USUARIO';

    IF v_count = 0 THEN
        EXECUTE IMMEDIATE '
            CREATE SEQUENCE seq_usuarios_id
            START WITH 1
            INCREMENT BY 1
            NOCACHE
        ';
    END IF;
END;
/
