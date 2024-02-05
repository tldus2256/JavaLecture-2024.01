# 1. 2009년도에 데뷔한 걸그룹의 힛트송은?
# (걸그룹이름,데뷔일자,힛트송제목)
SELECT gid, NAME, debut, hit_song_id
FROM girl_Group
WHERE year(debut) = 2009;

Select l.name, l.debut, r.title From girl_group l
Join song r ON l.hit_song_id=r.sid
WHERE l.debut between Data('2009-01-01') and date ('2009-12-31')    
WHERE l.debut LIKE '2009%';


# 2. 데뷔일자가 빠른 5개 그룹의 힛트송은?
# (걸그룹 이름, 데뷔일자, 힛트송 제목)
SELECT gid, name, debut, hit_song_id
FROM girl_Group
ORDER BY debut ASC
LIMIT 5;

Select l.name, l.debut, r.title From girl_group l
Join song r ON l.hit_song_id=r.sid
ORDER BY l.debut
LIMIT 5;

# 3. 대륙별로 국가숫자, GNP의 합, 국가별 GNP 평균?

SELECT Continent, COUNT(*) AS NumberOfCountries
FROM Country
GROUP BY Continent;


SELECT Continent, SUM(GNP) AS TotalGNP
FROM Country
GROUP BY Continent;


SELECT Name AS Country, GNP / Population AS AverageGNP
FROM Country;

Select Continent, count(*) num, round(SUM(GNP)) sumGnp, ROUND(AVG(GNP)) avgGnp 
    From country
    GROUP BY Continent;

# 4. 아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로 보여줄 것
# (대륙명, 국가명, 도시명, 인구수)
Select r.Continent, r.name countryName, l.name cityName, l.population 
    FROM city l
    jOIN country r
    ON l.countrycode = r.Code
    WHERE Continent='Asia'
    ORDER BY l.population DESC
    LIMIT 10;

SELECT r.Continent, r.name, l.Name, l.population 
    FROM city l
    JOIN country r 
    ON l.CountryCode=r.Code
    WHERE r.Continent='Asia'
    ORDER BY l.population DESC
    LIMIT 10;

# 5. 전 세계에서 GNP가 높은 10개 국가에서 사용하는 공식언어는?
# (국가명, GNP, 언어명)
SELECT  r.name `Name`, l.countrycode `language`, r.GNP 
    FROM country r
    JOIN countrylanguage l
    ON l.countrycode = r.Code
    ORDER BY r.GNP DESC
    LIMIT 10;

SELECT l.NAME, l.GNP, r.`Language` 
    FROM country l
    JOIN countrylanguage r
    ON l.Code = r.countrycode
    WHERE r.IsOfficial='T'
    ORDER BY l.GNP DESC
    LIMIT 10;
