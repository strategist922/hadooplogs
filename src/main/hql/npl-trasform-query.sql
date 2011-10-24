add file /Users/hadoophive/IdeaProjects/normalizeFiles/src/main/groovy/map-nplnonsdo.groovy;
INSERT OVERWRITE TABLE NPL_STAT 
SELECT provider, flowtype, delivery, status, count(distinct publisher_doc_id), min(xp) as min_xp,max(xp) as max_xp
FROM npl_normalized_log 
GROUP BY status, delivery, provider, flowtype
ORDER BY provider,flowtype,delivery;
