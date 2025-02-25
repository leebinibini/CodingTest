-- 코드를 작성해주세요
SELECT  COUNT(*)  AS COUNT
  FROM  ECOLI_DATA A
 WHERE   (2 != (GENOTYPE & 2)) 
        AND (((4 & GENOTYPE) = 4) OR (( 1 & GENOTYPE ) = 1))